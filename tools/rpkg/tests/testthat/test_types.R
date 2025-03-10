test_that("test_all_types() output", {
  skip_on_os("windows")

  con <- dbConnect(duckdb())
  on.exit(dbDisconnect(con, shutdown = TRUE))

  local_edition(3)
  withr::local_options(digits.secs = 6)

  expect_snapshot({
    as.list(dbGetQuery(con, "SELECT * EXCLUDE (timestamp_tz, time_tz, map, bit) REPLACE(replace(varchar, chr(0), '') AS varchar) FROM test_all_types()"))
  })
})

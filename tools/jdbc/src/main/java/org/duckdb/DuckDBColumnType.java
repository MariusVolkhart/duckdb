package org.duckdb;

import java.sql.Types;

public enum DuckDBColumnType {
	BOOLEAN(Types.BOOLEAN),
	TINYINT(Types.TINYINT),
	SMALLINT(Types.SMALLINT),
	INTEGER(Types.INTEGER),
	BIGINT(Types.BIGINT),
	UTINYINT(Types.JAVA_OBJECT),
	USMALLINT(Types.JAVA_OBJECT),
	UINTEGER(Types.JAVA_OBJECT),
	UBIGINT(Types.JAVA_OBJECT),
	HUGEINT(Types.JAVA_OBJECT),
	FLOAT(Types.FLOAT),
	DOUBLE(Types.DOUBLE),
	DECIMAL(Types.DECIMAL),
	VARCHAR(Types.VARCHAR),
	BLOB(Types.BLOB),
	TIME(Types.TIME),
	DATE(Types.DATE),
	TIMESTAMP(Types.TIMESTAMP),
	TIMESTAMP_MS(Types.TIMESTAMP),
	TIMESTAMP_NS(Types.TIMESTAMP),
	TIMESTAMP_S(Types.TIMESTAMP),
	TIMESTAMP_WITH_TIME_ZONE(Types.TIMESTAMP_WITH_TIMEZONE),
	INTERVAL(Types.JAVA_OBJECT),
	LIST(Types.ARRAY),
	STRUCT(Types.JAVA_OBJECT),
	ENUM(Types.JAVA_OBJECT),
	UUID(Types.JAVA_OBJECT),
	JSON(Types.JAVA_OBJECT),
	MAP(Types.JAVA_OBJECT),
	UNKNOWN(Types.OTHER);

	/**
	 * SQL type from {@link java.sql.Types}.
	 */
	final int typeCode;

	DuckDBColumnType(int typeCode) {
		this.typeCode = typeCode;
	}
}

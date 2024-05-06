package com.example.persistence;

class DatabaseTables {

    static class Animal {
        static final String TABLE_NAME = "animal";
        static final String COLUMN_NAME_ID = "id";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_COLOR = "color";
    }

    static final String SQL_CREATE_TABLE_ANIMAL =
            // "CREATE TABLE animal (id INTEGER PRIMARY KEY, name TEXT, color TEXT)"
            "CREATE TABLE " + Animal.TABLE_NAME + " (" +
                    Animal.COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                    Animal.COLUMN_NAME_NAME + " TEXT," +
                    Animal.COLUMN_NAME_COLOR + " TEXT)";

    static final String SQL_DELETE_TABLE_ANIMAL =
            // "DROP TABLE IF EXISTS animal"
            "DROP TABLE IF EXISTS " + Animal.TABLE_NAME;
}
Generally, indexes should be used on tables whose data does not change frequently but is used a lot in select search queries. 

Create indexes
/* CREATE INDEX id_index ON table_name(column_name); */

Show indexes
SHOW INDEXES FROM table_name;

Drop indexes
DROP INDEX `index_id` ON `table_name`;

/* notes */
/* https://chartio.com/learn/databases/how-does-indexing-work/ */
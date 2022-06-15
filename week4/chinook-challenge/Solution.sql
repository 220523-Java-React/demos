
select * from "Employee"

select * from "Employee" where "LastName" = 'King'

select * from "Employee" where "FirstName" = 'Andrew' and "ReportsTo" is null

select * from "Album" order by "Title" desc

select "FirstName" from "Customer" order by "City" asc

select * from "Genre"

insert into "Genre"("GenreId", "Name") values(26, 'Basketweaved Fusion Folk')

insert into "Genre"("GenreId", "Name") values(27, 'Polka')

select * from "Employee"

insert into "Employee"("EmployeeId", "LastName", "FirstName") values(9, 'Mouse', 'Minnie')

insert into "Employee"("EmployeeId", "LastName", "FirstName") values(10, 'Goober', 'Goofy')

select * from "Customer"

insert into "Customer"("CustomerId", "FirstName", "LastName", "Email") values (60, 'Mickey', 'Mouse', 'mickey@gmail.com')

insert into "Customer"("CustomerId", "FirstName", "LastName", "Email") values (61, 'Donald', 'Duck', 'donny@gmail.com')

select * from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walker'

update "Customer" set "FirstName" = 'Robert', "LastName" = 'Walker' where "FirstName" = 'Aaron' and "LastName" = 'Mitchell'

select * from "Artist" where "Name" = 'CCR'

update "Artist" set "Name" = 'CCR' where "Name" = 'Creedence Clearwater Revival'

select * from "Invoice" where "Total" between 15 and 50

select * from "Employee" e 

select * from "Employee" where "HireDate" between '06/01/2003' and '03/01/2004'

select * from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walker'

select * from "Invoice" where "CustomerId" = 32

delete from "Invoice" where "CustomerId" = 32

delete from "InvoiceLine" where "InvoiceId" = 61 or "InvoiceId" = 116 or "InvoiceId" = 245 or "InvoiceId" = 268 or "InvoiceId" = 290 or "InvoiceId" = 342

delete from "Customer" where "FirstName" = 'Robert' and "LastName" = 'Walker'




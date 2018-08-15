/*
Enter your query here.
Please append a semicolon ";" at the end of the query and enter your query in a single line to avoid error.
*/
SELECT Company.company_code, Company.founder, COUNT(DISTINCT Lead_Manager.lead_manager_code), COUNT(DISTINCT Senior_Manager.senior_manager_code), COUNT(DISTINCT Manager.manager_code), COUNT(DISTINCT Employee.employee_code)
FROM Company, Lead_Manager, Senior_Manager, Manager, Employee
WHERE Company.company_code = Lead_Manager.company_code AND Company.company_code = Senior_Manager.company_code AND Company.company_code = Manager.company_code AND Company.company_code = Employee.company_code
GROUP BY Company.company_code, Company.founder
ORDER BY Company.company_code ASC;
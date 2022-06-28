# SpringBootDemo


### Port : 8082

H2 console to view database : http://localhost:8080/h2-console/login.do?jsessionid=a98d6788c4f8bfbbf1e207db8fe96e78

### Postman requests:
{
	"info": {
		"_postman_id": "c5a12611-54e7-4b79-9857-076ca7eea2ce",
		"name": "Department API",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "SaveDepartment",
			"request": {
				"method": "POST",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"departmentName\":\"IT\",\n    \"departmentAddress\":\"Pune\",\n    \"departmentCode\":\"IT-06\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/departments",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"departments"
					]
				}
			},
			"response": []
		},
		{
			"name": "GetDepartments",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/departments",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"departments"
					]
				}
			},
			"response": []
		},
		{
			"name": "GetDepartmentById",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/departments/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"departments",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "Delete department by Id",
			"request": {
				"method": "DELETE",
				"header": [],
				"url": {
					"raw": "http://localhost:8080/departments/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"departments",
						"2"
					]
				}
			},
			"response": []
		},
		{
			"name": "Update Department",
			"request": {
				"method": "PUT",
				"header": [],
				"body": {
					"mode": "raw",
					"raw": "{\n    \"departmentName\":\"IT\",\n    \"departmentAddress\":\"Pune\",\n    \"departmentCode\":\"IT-0666\"\n}",
					"options": {
						"raw": {
							"language": "json"
						}
					}
				},
				"url": {
					"raw": "http://localhost:8080/departments/2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8080",
					"path": [
						"departments",
						"2"
					]
				}
			},
			"response": []
		}
	]
}

# 🏥 API Sistema Medico

Este proyecto es una API para la gestión de un sistema médico. Proporciona funcionalidades para manejar pacientes, doctores, citas y otros aspectos relacionados con la administración de un centro médico.

## 📋 Requisitos

- Maven instalado en su PC

## 🚀 Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/Chris-Liter/API-Sistema-Medico.git
    ```
2. Navega al directorio del proyecto:
    ```bash
    cd API-Sistema-Medico
    ```

## ⚙️ Configuración

1. Crea un archivo `.env` en la raíz del proyecto y configura las variables de entorno necesarias:
    ```env
    PORT=8080
    ```

## ▶️ Uso

1. Inicia el servidor:
    ```bash
    mvn spring-boot:run
    ```
2. La API estará disponible en `http://localhost:8080`.

## 🐳 Docker Compose

Este proyecto utiliza Docker Compose para facilitar la ejecución de la API y sus servicios asociados.

### 🛠️ Herramientas utilizadas

1. **API**: Contenedor con Spring Boot expuesto en el puerto `8080`.
2. **Base de Datos**: Contenedor con PostgreSQL para almacenar los datos.
3. **pgAdmin**: Herramienta gráfica para gestionar PostgreSQL.

### ▶️ Ejecución con Docker Compose

1. Asegúrate de tener Docker y Docker Compose instalados.
2. Ejecuta el siguiente comando desde la raíz del proyecto:
   ```bash
   docker-compose up --build
## 🌐 Acceso a los Servicios

Los servicios estarán disponibles en:

- **API**: [http://localhost:8080](http://localhost:8080)
- **pgAdmin**: [http://localhost:5050](http://localhost:5050)  
  - **Usuario**: `admin@admin.com`  
  - **Contraseña**: `admin`

## 📚 Endpoints

- `GET /pacientes`: Obtiene la lista de pacientes.
- `POST /pacientes`: Crea un nuevo paciente.
- `GET /doctores`: Obtiene la lista de doctores.
- `POST /doctores`: Crea un nuevo doctor.
- `GET /citas`: Obtiene la lista de citas.
- `POST /citas`: Crea una nueva cita.

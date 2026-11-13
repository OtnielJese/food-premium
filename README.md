## Levantar el proyecto

Requisito: Docker Desktop.

```bash
docker compose up --build
```

- Frontend: http://localhost:5173
- API: http://localhost:8080
- Datos de prueba cargados automáticamente (perfil dev)

### Para desarrollar
- Backend desde el IDE: `docker compose up db` y ejecutar la app con el perfil `dev`
- Frontend con recarga en caliente: `docker compose up db api` y en `frontend/` ejecutar `npm run dev`

### Apagar
- `docker compose down`: detiene todo
- `docker compose down -v`: detiene todo y **borra la base de datos** (para empezar de cero)
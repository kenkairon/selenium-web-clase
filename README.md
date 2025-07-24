# Proyecto de Automatización de Pruebas Selenium POM

Este proyecto automatiza el formulario de https://selenium-bootcamp.netlify.app/ y la sección Scroll & Espera usando Selenium WebDriver, JUnit 5, WebDriverManager y el patrón Page Object Model (POM).

## Estructura
- `src/test/java/pages/FormularioPage.java`: Page Object del formulario principal.
- `src/test/java/pages/ScrollEsperaPage.java`: Page Object para la sección Scroll & Espera.
- `src/test/java/tests/FormularioTest.java`: Test automatizado del formulario principal.
- `src/test/java/tests/ScrollEsperaTest.java`: Test automatizado para la sección Scroll & Espera.
- `pom.xml`: Dependencias y configuración Maven.

## Ejecución
1. Instala dependencias: `mvn clean install`
2. Ejecuta todos los tests: `mvn test`
3. Ejecuta solo el test del formulario: `mvn -Dtest=FormularioTest test`
4. Ejecuta solo el test de Scroll & Espera: `mvn -Dtest=ScrollEsperaTest test`

## Tecnologías
- Selenium WebDriver
- JUnit 5
- WebDriverManager
- Maven

## Buenas prácticas
- Separación de lógica de página y test (POM)
- Comentarios pedagógicos en el código
- Localizadores robustos y validaciones tras cada acción

---

Este proyecto es una base para aprender automatización de pruebas web profesional en Java, incluyendo validaciones de formularios y manejo de esperas y scroll en modales.

---

**Licencia:** MIT
**Autor:** Miguel Ramos ([https://github.com/MiguelAngelRamos](https://github.com/MiguelAngelRamos))
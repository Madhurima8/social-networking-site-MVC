# Social Networking Site (MVC) — Play Framework (Scala 3)

A minimal social-networking web app built with the **Play Framework (2.9.0)** using the **MVC pattern** on **Scala 3.3.1**.  
Hot-reload development via `sbt`, and first-class IDE support with **IntelliJ IDEA + Scala plugin**.

---

## Tech Stack

- **Language:** Scala 3.3.1
- **Web framework:** Play Framework 2.9.0 (PlayScala plugin)
- **DI:** Guice
- **Build tool:** sbt ≥ 1.9
- **JDK:** 17 recommended (11 or 21 also work)

---

## Features (baseline)

- Standard Play MVC layout (`app/controllers`, `app/models`, `app/views`)
- Routes configured in `conf/routes`
- Dependency injection with Guice
- Dev server with hot reload (`~run`)
- Production packaging via `sbt dist` / `sbt stage`

---

## Project Layout

```bash
.
├── app/
│ ├── controllers/ # Controllers (HTTP actions)
│ ├── models/ # Domain models & services
│ └── views/ # Twirl templates (*.scala.html)
├── conf/
│ ├── application.conf # Configuration (ports, db, secrets)
│ └── routes # HTTP routes → controller actions
├── public/ # Static assets (js, css, images)
├── project/
│ ├── build.properties # sbt.version
│ └── plugins.sbt # Play sbt plugin (2.9.x)
├── build.sbt # Build definition
└── target/ # Build output (ignored)
```
---

---

## Prerequisites

- **JDK:** 17 (preferred)
- **sbt:** 1.9+
- **IntelliJ IDEA Community** with **Scala** plugin (recommended)

Check:
```bash
java -version
sbt --version
```
---
## Getting Started
### Clone the repository

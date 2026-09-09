# Competition

## Purpose

Represents an official football competition.

Examples:

- FIFA World Cup
- UEFA Champions League
- Copa Libertadores
- Premier League

---

## Definition

A Competition is an organized football competition that defines the competitive framework under which football matches are played.

---

## Why it exists

Competitions establish:

- Rules
- Format
- Qualification
- Objectives
- Competitive context
- Sporting objectives

Without competitions, football matches lose competitive meaning.

---

## Responsibilities

- Defines competition regulations.
- Defines competition format.
- Organizes Tournament Editions.

---

## Relationships

Competition

|
v

Tournament Edition

|
v

Stages

|
v

Matches

---

## Lifecycle

Created

|
v

Active

|
v

Produces Tournament Editions

|
v

Continues

---

## Design Principles

- A Competition may contain many Tournament Editions.

- A Tournament Edition belongs to exactly one Competition.

- Competitions are immutable historical concepts.

- Competition identity is independent from its editions.

---

## Classification

Core Entity

---

## Design Notes

Competition is intentionally independent from any software implementation.

This entity represents a real-world football concept and should remain stable even if the FARFAN Engine architecture evolves.


---

## Open Questions

Status: Pending Architectural Decision

Question:

Should Friendly Matches belong to a Competition?

Potential ADR:

ADR-0002

---

# Tournament Edition

## Purpose

Represents a specific edition of a Competition.

---

## Definition

A Tournament Edition is a specific edition of a Competition.

---

## Relationships

Competition

|
v

Tournament Edition

|
v

Stage

---

## Design Principles

- A Tournament Edition belongs to exactly one Competition.

- A Tournament Edition contains Stages.

---

## Classification

Core Entity

---

# Stage

## Purpose

Represents a competitive phase within a Tournament Edition.

---

## Definition

Stage represents a competitive phase within a Tournament Edition.

---

## Relationships

Tournament Edition

|
v

Stage

---

## Design Principles

- Stage belongs to a specific Tournament Edition.

- Stage is not modeled directly as a child of Competition.

---

## Classification

Core Entity

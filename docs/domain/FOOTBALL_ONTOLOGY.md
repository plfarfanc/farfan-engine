# Football Ontology

**Status:** Draft

**Version:** 0.1

**Owner:** FARFAN Engine Team

---

# Purpose

The Football Ontology defines the conceptual universe of football as understood by the FARFAN Engine.

Its purpose is to identify every relevant concept that exists in football, independently of any software implementation.

This document represents the highest level of abstraction of the Football Knowledge Base.

---

# Scope

This ontology defines:

- What exists in football.
- The major conceptual domains.
- The boundaries of the football universe.
- The concepts the FARFAN Engine may reason about.

This document intentionally does NOT define:

- Attributes
- Business rules
- Database models
- APIs
- Source code

Those concerns belong to other documents.

---

# Fundamental Principle

The FARFAN Engine does not invent football.

It models football.

The ontology therefore represents reality, not software.

---

# The Football Universe

The football universe is composed of seven conceptual domains.

```
Football Universe
│
├── Competitions
├── Organizations
├── People
├── Matches
├── Context
├── Knowledge
└── Learning
```

---

# The Football Reality

---

# The Football Intelligence

---

# Conceptual Domains

## Competitions

Represents organized football competitions.

Examples:

- FIFA World Cup
- UEFA Champions League
- Premier League
- Copa Libertadores

Questions this domain answers:

- What competition is being played?
- Which edition?
- Which stage?

---

## Organizations

Represents football organizations.

Examples:

- National Teams
- Football Clubs
- Federations
- Confederations

Questions:

- Which organization participates?
- How are organizations related?

---

## People

Represents every person involved in football.

Examples:

- Players
- Coaches
- Referees

Questions:

- Who participates?
- What role does each person play?

---

## Matches

Represents football events.

A match is the central event from which the FARFAN Engine learns.

Questions:

- Who played?
- What happened?
- What was the result?

---

## Context

Represents every external factor that may influence a match.

Examples:

- Stadium
- Weather
- Altitude
- Home Advantage
- Travel
- Rest Days
- Crowd Support

Questions:

- Under what conditions was the match played?

---

## Knowledge

Represents football knowledge.

Unlike previous domains, this domain does not represent physical entities.

Instead, it represents football concepts.

Examples:

- Playing Style
- Tactical Identity
- Team Cohesion
- Leadership
- Technical Profile
- Tactical Profile
- Psychological Profile
- Current Form
- Player Synergy

Questions:

- What does the Engine know about football?

---

## Learning

Represents knowledge generated after matches.

Examples:

- Match Analysis
- Historical Insight
- Calibration
- Lessons Learned

Questions:

- What did the Engine learn?

---

# Ontology Principles

## Principle 1

The ontology describes reality.

It does not describe software.

---

## Principle 2

Every concept must exist independently of the FARFAN Engine.

---

## Principle 3

The ontology evolves slowly.

New concepts should only be added when they represent genuine football concepts.

---

## Principle 4

Implementation details never belong in the ontology.

---

# Relationship with other documents

This document is the foundation of the domain.

It is complemented by:

- UBIQUITOUS_LANGUAGE.md
- ENTITY_CATALOG.md
- RELATIONSHIPS.md
- DOMAIN_MODEL.md
- KNOWLEDGE_MODEL.md

---

# Open Questions

- Should supporters/fans become their own conceptual domain?
- Should media and journalism belong to the ontology?
- Should financial concepts (transfers, contracts, salaries) be included?
- Where should injuries and suspensions belong: Context or Knowledge?

---

# Change History

| Version | Description |
|----------|-------------|
| 0.1 | Initial ontology created. |
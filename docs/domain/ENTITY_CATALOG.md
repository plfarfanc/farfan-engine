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

- A Competition is not directly related to Match.

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

How should Friendly Matches relate to Competition, Tournament Edition, and Stage?

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

- A Tournament Edition is not directly related to Match.

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

|
v

Matches

---

## Design Principles

- Stage belongs to a specific Tournament Edition.

- Stage contains multiple Matches.

- Stage is not modeled directly as a child of Competition.

---

## Classification

Core Entity

---

# Match

## Purpose

Represents a football event played between two Teams.

---

## Definition

A Match is a football event played between two Teams.

---

## Identity

Match has its own domain identity represented conceptually as MatchId.

MatchId identifies one specific Match.

Match identity is not derived from date/time, Teams, or any other attribute.

The source of MatchId is not decided yet.

---

## Relationships

Stage

|
v

Match

Match

|
v

Home Team

Match

|
v

Away Team

---

## Properties

- Match has a date/time property.
- Date/time is not part of Match identity.

---

## Design Principles

- A Match belongs to one Stage.

- A Match is played between exactly two Teams.

- The two participants are represented as Home Team and Away Team.

- Match is not directly related to Competition.

- Do not introduce a separate participant-role abstraction for Match v1.

---

## Classification

Core Entity

---

## Deferred from Match v1

- Score / Result
- Match Status
- Stadium / Venue
- Neutral Venue
- Match Events
- Weather
- Other Context
- Friendly Match modeling
- Aggregate scores
- Penalty shootouts
- Postponed/abandoned match behavior

---

# Team

## Purpose

Represents an organized football collective.

---

## Definition

A Team is an organized football collective.

---

## Identity

Team has its own domain identity represented conceptually as TeamId.

TeamId identifies one specific Team.

---

## Relationships

Team

|
v

Matches

Match

|
v

Home Team

Match

|
v

Away Team

---

## Properties

- Name
- Country

---

## Design Principles

- Team participates in Matches.

- Match references exactly two Teams.

- The two Match Team references are represented as Home Team and Away Team.

---

## Classification

Core Entity

---

## Deferred from Team v1

- Players
- Coach
- Staff
- Squad
- Tactical Identity
- Technical Profile
- Psychological Profile
- Current Form
- Team History
- Club vs National Team classification
- Competition participation details
- Team statistics
- Advanced Team concepts

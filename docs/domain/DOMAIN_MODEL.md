# Domain Model

**Status:** In Progress

This document is part of the planned FARFAN Engine architecture.

## Approved Domain Slice

The currently approved domain slice contains:

- Competition
- Tournament Edition
- Stage
- Match
- Team

## Approved Relationship Chain

Competition

|
v

Tournament Edition

|
v

Stage

|
v

Match

Match is not directly related to Competition.

## Match v1

Match is a Core Entity.

Match has its own domain identity represented conceptually as MatchId.

MatchId identifies one specific Match.

Match identity is not derived from date/time, Teams, or any other attribute.

A Match belongs to one Stage.

A Stage contains multiple Matches.

A Match is played between exactly two Teams:

- Home Team
- Away Team

Match has a date/time property.

Date/time is not part of Match identity.

## Team v1

Team is a Core Entity.

Team has its own domain identity represented conceptually as TeamId.

TeamId identifies one specific Team.

Team has the following properties:

- Name
- Country

Team participates in Matches.

Match references exactly two Teams:

- Home Team
- Away Team

## Implementation Baseline

- Java
- Maven
- JUnit 5
- No framework in the Domain layer

## Scope Boundaries

The current domain model does not include Score / Result, Match Status, Stadium / Venue, Neutral Venue, Match Events, Weather, Other Context, Friendly Match modeling, aggregate scores, penalty shootouts, postponed or abandoned match behavior, Players, Coach, Staff, Squad, Tactical Identity, Technical Profile, Psychological Profile, Current Form, Team History, Club vs National Team classification, Competition participation details, Team statistics, Advanced Team concepts, Referee, Knowledge, Reasoning, Learning, persistence, APIs, or infrastructure.

Friendly Match relationships with Competition, Tournament Edition, and Stage remain open domain decisions.

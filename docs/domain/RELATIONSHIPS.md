# Relationships

**Status:** In Progress

This document is part of the planned FARFAN Engine architecture.

## Initial Domain Slice

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

## Approved Relationships

- A Competition contains Tournament Editions.
- A Tournament Edition belongs to exactly one Competition.
- A Tournament Edition contains Stages.
- Stage belongs to a specific Tournament Edition.
- A Stage contains multiple Matches.
- A Match belongs to one Stage.
- Stage is not modeled directly as a child of Competition.
- Match is not directly related to Competition.
- A Match is played between exactly two Teams.
- A Match has a Home Team.
- A Match has an Away Team.

## Match Identity and Properties

- Match has its own domain identity represented conceptually as MatchId.
- MatchId identifies one specific Match.
- Match identity is not derived from date/time, Teams, or any other attribute.
- Match has a date/time property.
- Date/time is not part of Match identity.

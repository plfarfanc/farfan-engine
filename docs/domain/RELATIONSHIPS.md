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

## Approved Relationships

- A Competition contains Tournament Editions.
- A Tournament Edition belongs to exactly one Competition.
- A Tournament Edition contains Stages.
- Stage belongs to a specific Tournament Edition.
- Stage is not modeled directly as a child of Competition.

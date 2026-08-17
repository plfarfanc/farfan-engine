# Purpose

# Purpose

The Ubiquitous Language defines the official vocabulary of the FARFAN Engine.

Every architectural decision, document and software component must use these terms consistently.

Its objective is to establish a common language shared by domain experts, developers and the Engine itself.

# Principles

- One concept has one official name.

- One official name has one meaning.

- Business terminology takes precedence over technical terminology.

- Definitions belong to the domain, not to the implementation.

# Core Vocabulary

| Term               | Definition                                  | Status   |
| ------------------ | ------------------------------------------- | -------- |
| Competition        | An organized football competition.          | Approved |
| Tournament Edition | A specific edition of a Competition.        | Approved |
| Match              | A football event played between two Teams.  | Approved |
| Team               | An organized football collective.           | Approved |
| Player             | A football participant belonging to a Team. | Approved |


# Naming Rules

- Entity names are singular.

- Entity names use nouns.

- Behaviors use verbs.

- Abbreviations are avoided in the domain model.

# Evolution Rules

A new domain term may only be introduced if:

- it represents a new football concept,

- it cannot be expressed using existing vocabulary,

- it is approved during an architectural review,

- it is documented before implementation.
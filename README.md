# NLX - Natural Language Platform

this software, (which is currently in prototype state) represents an extendable platform for all kinds of natural language processing. Core of this software builds a DSL generated with the XText Framework. This DSL can turn text of natural language documents into a DAG tree of the document content. It creates a Tree from:

```
Document
|
+-Paragraph
| +-Chapter
| +-Sentence Chain
| | +-Sentence
| | | +-Subsentence
| | | | +-Word
| | | | +-Units
| | | | +-URLs
| | | | +-Symbols
| | | | +-Operators
| | | | +-Bracket Sentences
| | | | +-...&more
| +-ListSentence
| | +-Sentence Chain
| | | + ...
| +-Table
```

This tree then can then be parsed with all kind of plugins that can be build on top of this platform.

As a first use case a generator is implemented, that can turn the DAG-Graph into a XMI-Model of Requirements.
Currently under Development is: 
* a DoorsNext interface that can turn those parsed Documents into DOORS Requirements)
* an Interface that can be trained to understand the model of a sentence and will turn it into a relational ontology. On top of that we will do all kind of semantic analyses which can:
  * check Documents in consistency of meanings, double declaration, abiguities, contradictions and so forth
  * Requirement to SYSML-Models to be used for code generation
  * Spam-Bots, Fake-News, and much more use cases possible...

# Gilded Rose Refactoring Kata

**Note** _The Kotlin source code and this README has been copied from Emily Bache's **Gilded Rose Refactoring Kata**
repository and has been edited to remove the following,_

- _Mention of a failing unit test, this exercise does not have a failing test._
- _Section about porting this exercise to other programming languages. Please send PRs to the original repo._

_To try this kata in a different programming language, please see
the [original repo](https://github.com/emilybache/GildedRose-Refactoring-Kata)._

## Introduction

This Kata was originally created by Terry Hughes (http://twitter.com/TerryHughes). It is already on
GitHub [here](https://github.com/NotMyself/GildedRose). See
also [Bobby Johnson's description of the kata](http://iamnotmyself.com/2011/02/13/refactor-this-the-gilded-rose-kata/).

I translated the original C# into a few other languages, (with a little help from my friends!), and slightly changed the
starting position. This means I've actually done a small amount of refactoring already compared with the original form
of the kata, and made it easier to get going with writing tests. I also added test fixtures for Text-Based approval
testing with TextTest (
see [the TextTests](https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/texttests))

As Bobby Johnson points out in his
article ["Why Most Solutions to Gilded Rose Miss The Bigger Picture"](http://iamnotmyself.com/2012/12/07/why-most-solutions-to-gilded-rose-miss-the-bigger-picture)
, it'll actually give you better practice at handling a legacy code situation if you do this Kata in the original C#.
However, I think this kata is also really useful for practicing writing good tests using different frameworks and
approaches, and the small changes I've made help with that. I think it's also interesting to compare what the refactored
code and tests look like in different programming languages.

I use this kata as part of my work as a technical coach. I wrote a lot about the coaching method I use in this
book [Technical Agile Coaching with the Samman method](https://leanpub.com/techagilecoach). A while back I wrote this
article ["Writing Good Tests for the Gilded Rose Kata"](http://coding-is-like-cooking.info/2013/03/writing-good-tests-for-the-gilded-rose-kata/)
about how you could use this kata in a [coding dojo](https://leanpub.com/codingdojohandbook).

## How to use this Kata

The simplest way is to just clone the code and start hacking away improving the design. You'll want to look at
the ["Gilded Rose Requirements"](https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/GildedRoseRequirements.txt)
which explains what the code is for. I strongly advise you that you'll also need some tests if you want to make sure you
don't break the code while you refactor.

You could write some unit tests yourself, using the requirements to identify suitable test cases. I've provided a
failing unit test in a popular test framework as a starting point for most languages.

Alternatively, use the "Text-Based" tests provided in this repository. (Read more about that in the next section)

Whichever testing approach you choose, the idea of the exercise is to do some deliberate practice, and improve your
skills at designing test cases and refactoring. The idea is not to re-write the code from scratch, but rather to
practice designing tests, taking small steps, running the tests often, and incrementally improving the design.

### Gilded Rose Requirements in other languages

- [English](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements.txt)
- [Español](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_es.md)
- [Français](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_fr.md)
- [日本語](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_jp.md)
- [Português](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_pt-BR.md)
- [Русский](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_ru.txt)
- [ไทย](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_th.md)
- [中文](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_zh.txt)
- [한국어](https://github.com/emilybache/GildedRose-Refactoring-Kata/blob/main/GildedRoseRequirements_kr.md)

## Text-Based Approval Testing

This code comes with comprehensive tests that use this approach. For information about how to run them, see
the [texttests README](https://github.com/emilybache/GildedRose-Refactoring-Kata/tree/master/texttests)

## Better Code Hub

I analysed this repo according to the clean code standards on [Better Code Hub](https://bettercodehub.com) just to get
an independent opinion of how bad the code is. Perhaps unsurprisingly, the compliance score is low!

[![BCH compliance](https://bettercodehub.com/edge/badge/emilybache/GildedRose-Refactoring-Kata?branch=master)](https://bettercodehub.com/)

# Parsnip

A proof of concept paren watching test.

Linters are all well and good, but if they aren't part of your development flow
they can cause friction in a team. Nobody likes broken builds on the CI server.
Wouldn't it be great if you could just run your linter as a test instead?
That way you get immediate feedback through `lein test` or `lein test-refresh`.

If you run the tests for this project, you'll see a failing test!

The culprit is an egregious use of trailing parenthesis degeneracies.
If you fix the trailing paren, the test passes again.

The test is checking that all files in "src" and "test" conform to paredit mode.
Paredit mode is very liberal and only complains about egregious misuse of parenthesis.
The test does not change any files, it leaves that to your discretion.

See http://parinfer.trydiscourse.com/t/parinfer-based-style-checker/15 for discussion.

## Usage

`lein test` or `lein test-refresh`

## License

Copyright © 2018 Timothy Pratley

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

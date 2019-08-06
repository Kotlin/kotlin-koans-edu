## Operators overloading

Implement date arithmetic. Support adding years, weeks, and days to a date.
You could write the code like this: `date + YEAR * 2 + WEEK * 3 + DAY * 15`.

First, add the extension function `plus()` to `MyDate`, taking the `TimeInterval` as an argument.
Use the utility function `MyDate.addTimeIntervals()` declared in
`DateUtil.kt`

Then, try to support adding several time intervals to a date.
You may need an extra class.

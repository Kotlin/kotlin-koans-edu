# grey-box/kotlin-koans

Kotlin Koans are a series of exercises to get you familiar with the Kotlin
syntax. Each exercise is a failing unit test (or a compile error), and your
job is to make it pass.

This is the **ASU2026F intern team's fork** of
[Kotlin/kotlin-koans-edu](https://github.com/Kotlin/kotlin-koans-edu) —
modernized build tooling (Gradle 8.10.2, Kotlin 1.9.25), verified on JDK 17
and 21. Work through the koans here instead of the EduTools plugin or the
online player.

**Branches:**

- `master` — all 43 tasks unsolved (each answer replaced with `TODO()`,
  matching what the EduTools plugin serves). Start here.
- `solutions` — the completed tasks. Check your work against this **after**
  solving each task, not before.

## How we use this repo

1. **Environment first:** complete the setup guide in the lab repo
   ([asu2026f-git-lab → docs/setup.md](https://github.com/grey-box/asu2026f-git-lab/blob/main/docs/setup.md)).
2. **One branch per week per person**, named `koans/<your-username>/wkN`:
   ```bash
   git switch -c koans/yourusername/wk1
   ```
3. Solve that week's koans (check `exercises/weekN.md` in the lab repo for
   the assigned sections), running
   ```bash
   ./gradlew test        # Windows: gradlew.bat test
   ```
   as you go. The full run starts failing with unsolved koans; your goal each
   week is to clear the sections assigned that week.
4. **Open a pull request when you finish the week** — but PRs here are for
   **review only and are never merged**. Everyone works from `master`, so
   each new week starts from a fresh branch off `master`.

## Which koans

The course covers a subset of the sections (`Introduction`, `Collections`,
`Classes`, `Properties`). The week-by-week assignments live in the
[asu2026f-git-lab](https://github.com/grey-box/asu2026f-git-lab) repo under
`exercises/`.

Questions? Ask in the team channel.

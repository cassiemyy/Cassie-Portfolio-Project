# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## [Unreleased]

## [2025.9.18]
- Brainstormed 3 possible components to design
1. MusicQueue - queue based music playlist
2. RollForSandwich - random sandwich generator
3. WorkoutTracker - track and log exercises


## 2025.10.22

### Added

- Designed kernel and enhanced interfaces for RollForSandwich component
- Kernel interface includes method to roll one category, eat the whole sandwich/clear
all ingredients, and check if the sandwich is complete (all components are filled).
- Enhanced interface added methods that roll all categories at once, prints out the
full sandwich, and randomly rates the sandwich.

### Updated

- Method contracts: @ensures, @updates, @clears
- Javadoc comments
Feature: validate yahoo sign up

Scenario Outline:
Given User visits Yahoo homepage 
When User type "<full_name>" and "<email>" and "<password>"
Then User Select dropdown Month and "<day>" and "<year>"

Examples:
|full_name| email| password| day| year|
|Ashraf_Hussain| ashraf1992|Abcd786@._| 10| 2012|

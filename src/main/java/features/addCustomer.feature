# new feature
# Tags: optional

Feature: Add customer

#  Background:


  Scenario Outline: Add customer successfully
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/manager/addCust
    When  I type first name as <firstname>, last name as <lastname>, post code as <postcode>
    And I click submit
#    Then I verify that system is already added customer as <fullname> successfully

    Examples:
      | firstname | lastname | postcode |
      | thi       | thieu    | 45       |


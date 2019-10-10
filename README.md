# revenue-calculator

Calculator which returns the revenue for a specific client engagement, depending on the revenue calculation method.

Creation of a class for each method, with all of them implementing the same interface, which allows polymorphism.

Classes explained:

HourlyRateCalculator calculates the revenue of a client engagement when using a hourly rate mechanism.

FixedFeeCalculator calculates the revenue of a client engagement when using a fixed fee mechanism.

RoyaltyCalculator calculates the revenue of a client engagement when using a royalty share mechanism.

RevenueCalculatorRunner is the first and most basic main class, where a calculator of each type is created.

SalesPredictor is the second and last main class, where a mechanism was applied to predict the best revenue calculation method to utilize given a set of client engagements, which could be retrieved from a database, and the parameters of each calculator.

ClientEngagement is the class that allows the creation of client engagements.

RevenueCalculator is the interface that both HourlyRateCalculator, FixedFeeCalculator and RoyaltyCalculator implement.

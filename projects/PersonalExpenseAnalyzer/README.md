# Personal Expense Analyzer
A Java program designed to help students track and analyze their monthly income, expenses, savings, and remaining balance.

## 📌 Project Overview

The Personal Expense Analyzer was created to help me manage my monthly spending more effectively. As a student, I sometimes spend money on unnecessary purchases, which can result in exceeding my budget and using money that was originally intended for savings.

This program provides a structured way to record income and expenses, calculate financial results, and evaluate saving performance.

## 💡 Problem Being Solved

The program helps users:

- Track monthly income
- Record different categories of expenses
- Calculate total income
- Calculate total expenses
- Determine the remaining balance
- Calculate saving percentage
- Categorize saving performance

## 📥 Inputs

The program accepts:

- Monthly allowance
- Family support
- Food expenses
- Toiletries expenses
- Transport expenses
- Fixed savings
- Other expenses

## ⚙️ Program Features

- Calculates total income
- Calculates total expenses
- Calculates remaining balance
- Calculates saving percentage
- Categorizes saving performance
- Analyzes expenses for three months using a loop
- Displays the balance and saving status for each month

## 📊 Saving Categories

| Saving Percentage | Category |
|---|---|
| ≥ 50% | Excellent |
| 30% – 49% | Good |
| 10% – 29% | Average |
| < 10% | Poor |

## 🔄 Program Structure

The program uses:

- `if-else` statements for saving categorization
- A `for` loop to repeat calculations for three months
- Methods to organize program functionality
- `Scanner` for user input
- Variables of type `double` for financial values

## 🧮 Main Calculations

### Total Income

```text
Total Income = Monthly Allowance + Family Support
```
### Total Expenses
```text
Total Expenses = Food Expense + Toiletries Expense + Transport Expense + Fixed Saving + Other Expenses
```
Remaining Balance
```text
Remaining Balance = Total Income - Total Expenses
```
## 🛠️ Technologies Used
- Java
- Java Scanner
- Conditional Statements
- For Loop
- Methods
- Basic Problem-Solving

## 🎯 Learning Objectives
This project helped me practise:
- Java programming fundamentals
- Variables and data types
- User input using Scanner
- Arithmetic calculations
- If-else decision-making
- For loops
- Methods
- Parameters
- Void return types
- Basic program organization

## 🚧 Project Status
Completed as a Java programming assignment and uploaded as part of my Computer Science learning portfolio.

## 🔮 Future Improvements
Future versions of this project could include:
- Saving data to a file
- Reading previous expense records
- Adding a graphical user interface
- Storing multiple months of data
- Generating expense reports
- Adding visual charts for spending analysis
- Connecting the program to a database

## 🖥️ Sample Output

```text
===== My Personal Monthly Expense Analyzer =====
```
Analysis for Month 1

Monthly Allowance: RM450
Family Support: RM100
Food Expense: RM150
Toiletries Expense: RM50
Transport Expense: RM40
Other Expense: RM30
Fixed Saving: RM100

Total Income: RM550.0
Total Expense: RM370.0
Remaining Balance: RM180.0
Saving Status: Good

Note: The program repeats the analysis process for three months using a for loop.

```text
This project is part of my journey as a Bachelor of Computer Science student, where I am developing my programming and problem-solving skills.
```

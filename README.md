# Assignment 3: Software Quality Engineering
This is a repository for assignment 3 of the Software Quality Engineering course at the [Ben-Gurion University](https://in.bgu.ac.il/), Israel.

## Assignment Description
In this assignment, we tested an open-source software called prestashop(https://github.com/PrestaShop/PrestaShop).

PrestaShop is a freemium, open source e-commerce platform. The software is published under the Open Software
License (OSL). It is written in the PHP programming language with support for the MySQL database management system.
It has a software dependency on the Symfony PHP framework.

## Installation
You can install the software using xampp which is a free and open-source cross-platform web
server solution stack package developed by Apache Friends. you than have to download the
installation and go by the instructions.

## What we tested
We tested the case when a User log in into the store and add to his cart 2 pieces from one product(white shirt size small).
Then the admins logs in and change the quantity of this product to be 1.


*User story:* user add a product to cart twice

*Preconditions:* user loged in

*Expected outcome:* the products were added to the users cart

*User story:* Successful admin change quantity for white S size shirt to 1.

*Preconditions:* Admin loges in

*Expected outcome:* The quantity of the product changed to 1


## How we tested
We used two different testing methods:
1. [Cucumber](https://cucumber.io/), a BDD testing framework.
2. [Provengo](https://provengo.tech/), a story-based testing framework.

Each of the testing methods is elaborated in its own directory. 

## Results
Update all README.md files

## Detected Bugs
We detected the following bug:

1. Bug 1: 
   1. General description: User have 2 pieces of the product on his cart while the quantity of the product is actually 1.
   2. Steps to reproduce: ...
   3. Expected result: Error message for the user, "we apologize but there was an error"
   4. Actual result: no error shown




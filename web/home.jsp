<%-- 
    Document   : home
    Created on : Jul 31, 2015, 8:43:10 PM
    Author     : Ashlyn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>

    <head>
        <title>Puzzle Game - Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="styletwo.css">
    </head>
    <body class="homepage">
        <!-- Header -->
        <jsp:include page="header.jsp" flush="true"/>

        <div id="header-wrapper">
            <div id="banner">
                <div class="container">
                    <div class="row">
                        <section class="12u">
                            <header>
                                <h2>Welcome to Puzzle Game</h2>
                                <span class="byline">Please create a new game to play!</span>
                            </header>
                            <a href="#" class="button button-alt">Create New Game</a>
                        </section>
                    </div>
                </div>
            </div>			

        </div>
        <!-- Header Ends Here -->

        <!-- Featured Area -->
        <div id="featured-wrapper">

            <div class="container">
                <div class="row double">
                    <section class="4u">
                        <header>
                            <h2>Game 1</h2>
                        </header>
                        <a href="#" class="button button-style1">Join</a>
                    </section>
                    <section class="4u">
                        <header>
                            <h2>Game 2</h2>
                        </header>
                        <a href="#" class="button button-style1">Join</a>
                    </section>
                    <section class="4u">
                        <header>
                            <h2>Game 3</h2>
                        </header>
                        <a href="#" class="button button-style1">Join</a>
                    </section>
                    <br>
                    <br>
                    <br>
                    <br>
                </div>
            </div>

        </div>


        <!-- Featured Ends Here -->


        <div id="copyright" class="container">
            Team 02
        </div>
</html>


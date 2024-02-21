<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
    <link rel="stylesheet" href="css/bootstrap-grid.css">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatable" content="IE=edge"/>
    <meta name="viewport" content="width-device-width, initial-scale=1.0" />
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <meta charset="UTF-8">
        <title>Use of Structural Tags</title>
    </head>
    <body>
		<div id="wrapper">
        <?php
        // put your code here
        ?>
        <header>
            <p>This is the header</p>
        </header>
        <nav>
            <p>This is the Nav bar</p>
        </nav>
        <aside id="left">
            <p>less important info</p>
        </aside>
        <main>
            <article>
                <h1>Article 1</h1>
                <section>
                    <h2>Section 1</h2>
                </section>
                <section>
                    <h2>Section 2</h2>
                </section>
            </article>
            <article>
                <h1>Article 2</h1>
                <section>
                    <h2>Section 3</h2>
                </section>
                <section>
                    <h2>Section 4</h2>
                </section>
            </article>
        </main>
        <aside id="right">
            <p>Aside on the right</p>
        </aside>
        <footer>
            <address>Dublin Road, Dundalk</address>
        </footer>
		</div> <!-- end of wrapper div -->
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </html>
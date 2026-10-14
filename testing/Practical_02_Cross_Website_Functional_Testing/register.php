<?php
/*
 * Practical No : 02
 * Topic        : Cross-Website Functional Testing Using Selenium IDE
 * File name    : register.php
 */
// NOTE: the original document connected without selecting a database.
// "registration_db" (see database.sql) is selected here so the INSERT works.
$conn = mysqli_connect("localhost", "root", "", "registration_db");
if (!$conn) {
die("Connection Failed");
}
$fullname = $_POST['fullname'];
$email = $_POST['email'];
$username = $_POST['username'];
$password = $_POST['password'];
$sql = "INSERT INTO users(fullname,email,username,password)
VALUES('$fullname','$email','$username','$password')";
if(mysqli_query($conn,$sql))
{
echo "Registration Successful!";
}
else
{
echo "Registration Failed!";
}
mysqli_close($conn);
?>

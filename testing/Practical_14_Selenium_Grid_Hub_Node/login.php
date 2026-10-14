<?php
/*
 * Practical No : 14
 * Topic        : Selenium Server (Grid) Configuration and Remote Execution
 * File name    : login.php
 */
include "database.php";

$name = $_POST['name'];
$password = $_POST['password'];

/* Check whether name exists */
$name_sql = "SELECT * FROM users WHERE name='$name'";
$name_result = mysqli_query($conn, $name_sql);

if (mysqli_num_rows($name_result) == 0)
{
    /* Name does not exist, now check password */
    $password_sql = "SELECT * FROM users WHERE password='$password'";
    $password_result = mysqli_query($conn, $password_sql);

    if (mysqli_num_rows($password_result) == 0)
    {
        echo "Both Name and Password are Invalid";
    }
    else
    {
        echo "Invalid Name";
    }
}
else
{
    $user = mysqli_fetch_assoc($name_result);

    if ($user['password'] == $password)
    {
        echo "Login Successful";
    }
    else
    {
        echo "Invalid Password";
    }
}
?>

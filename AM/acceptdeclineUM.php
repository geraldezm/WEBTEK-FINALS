 <?php

                            require_once('db.php');

                            if($_GET["status"] == "Accept"){
                                 $sql = "UPDATE customer set status = 'Accepted' WHERE username = '".$_GET['username']."'";

                                $sql1 = "SELECT register_id, lastName, firstName, username, email, age, gender, address, contactNumber, status, typeOfuser FROM registration where username = '".$_GET['username']."'";
                                $result = $con->query($sql1);


                                if ($result->num_rows > 0) {
                                    $sql2 = "INSERT into customer (customerLastname, customerFirstname) Values ('".$row['customerLastname'] ."','". $row['customerFirstname']."')"; 
                                    
                                    $stmt1 = $con->prepare($sql2);

                                    $stmt1->execute();
                                }else{
                                        echo "0 results";
                                }
                            }else{
                                 $sql = "UPDATE registration set status = 'Declined' WHERE username = '".$_GET['username']."'";
                            }


                            $stmt = $con->prepare($sql);

                            $stmt->execute();

                            header("Location: spUM.php");


    
                            $con->close();
                            
                            ?>
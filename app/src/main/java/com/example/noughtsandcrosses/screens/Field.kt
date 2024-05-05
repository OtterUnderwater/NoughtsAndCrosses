package com.example.noughtsandcrosses.screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.noughtsandcrosses.ui.theme.NoughtsAndCrossesTheme
import com.example.noughtsandcrosses.ui.theme.Typography

@Composable
fun Field(navController: NavHostController?) {
    var moveNumber by remember { mutableStateOf(0) }
    var btnMoveNumber1 by remember { mutableStateOf(0) }
    var btnMoveNumber2 by remember { mutableStateOf(0) }
    var btnMoveNumber3 by remember { mutableStateOf(0) }
    var btnMoveNumber4 by remember { mutableStateOf(0) }
    var btnMoveNumber5 by remember { mutableStateOf(0) }
    var btnMoveNumber6 by remember { mutableStateOf(0) }
    var btnMoveNumber7 by remember { mutableStateOf(0) }
    var btnMoveNumber8 by remember { mutableStateOf(0) }
    var btnMoveNumber9 by remember { mutableStateOf(0) }
    var btn1 by remember { mutableStateOf(true) }
    var btn2 by remember { mutableStateOf(true) }
    var btn3 by remember { mutableStateOf(true) }
    var btn4 by remember { mutableStateOf(true) }
    var btn5 by remember { mutableStateOf(true) }
    var btn6 by remember { mutableStateOf(true) }
    var btn7 by remember { mutableStateOf(true) }
    var btn8 by remember { mutableStateOf(true) }
    var btn9 by remember { mutableStateOf(true) }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = "${
                    if (moveNumber % 2 == 0) {
                        "First"
                    } else {
                        "Second"
                    }
                } player's turn",
                style = Typography.titleLarge,
                modifier = Modifier.padding(bottom = 20.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .padding(horizontal = 10.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Row(modifier = Modifier.weight(1f / 3f))
                {
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn1 = false
                                moveNumber++
                                btnMoveNumber1 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn1,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn1) {
                                CreateShape(btnMoveNumber1)
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .fillMaxHeight()
                        .background(Color.Black))
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn2 = false
                                moveNumber++
                                btnMoveNumber2 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn2,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn2) {
                                CreateShape(btnMoveNumber2)
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .fillMaxHeight()
                        .background(Color.Black))
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn3 = false
                                moveNumber++
                                btnMoveNumber3 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn3,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn3) {
                                CreateShape(btnMoveNumber3)
                            }
                        }
                    }
                }
                Divider(color = Color.Black, thickness = 5.dp, modifier = Modifier.fillMaxWidth())
                Row(modifier = Modifier.weight(1f / 3f))
                {
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn4 = false
                                moveNumber++
                                btnMoveNumber4 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn4,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn4) {
                                CreateShape(btnMoveNumber4)
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .fillMaxHeight()
                        .background(Color.Black))
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn5 = false
                                moveNumber++
                                btnMoveNumber5 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn5,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn5) {
                                CreateShape(btnMoveNumber5)
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .fillMaxHeight()
                        .background(Color.Black))
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn6 = false
                                moveNumber++
                                btnMoveNumber6 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn6,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn6) {
                                CreateShape(btnMoveNumber6)
                            }
                        }
                    }
                }
                Divider(color = Color.Black, thickness = 5.dp, modifier = Modifier.fillMaxWidth())
                Row(modifier = Modifier.weight(1f / 3f))
                {
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn7 = false
                                moveNumber++
                                btnMoveNumber7 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn7,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn7) {
                                CreateShape(btnMoveNumber7)
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .fillMaxHeight()
                        .background(Color.Black))
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn8 = false
                                moveNumber++
                                btnMoveNumber8 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn8,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn8) {
                                CreateShape(btnMoveNumber8)
                            }
                        }
                    }
                    Spacer(modifier = Modifier
                        .width(5.dp)
                        .fillMaxHeight()
                        .background(Color.Black))
                    Box(modifier = Modifier.weight(1f / 3f)) {
                        Button(
                            onClick = {
                                btn9 = false
                                moveNumber++
                                btnMoveNumber9 = moveNumber
                            },
                            modifier = Modifier.fillMaxSize(),
                            enabled = btn9,
                            shape = RoundedCornerShape(0.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Transparent,
                                disabledContainerColor = Color.Transparent
                            )
                        ) {
                            if (!btn9) {
                                CreateShape(btnMoveNumber9)
                            }
                        }
                    }
                }
            }
        }
    }
}

//Вызов рисунка в зависимости от хода игрока
@Composable
fun CreateShape(moveNumber: Int) {
    if (moveNumber % 2 == 0) {
        CreateCircle()
    } else {
        CreateCross()
    }
}

//Отрисовка круга
@Composable
fun CreateCircle() {
    Canvas(
        modifier = Modifier.fillMaxSize(),
        onDraw = {
            drawCircle(
                color = Color.Blue,
                radius = 100f, // радиус круга
                style = Stroke(width = size.width * 0.075f) // ширина контура
            )
        }
    )
}

//Отрисовка крестика
@Composable
fun CreateCross() {
    Canvas(
        modifier = Modifier.fillMaxSize(),
        onDraw = {
            val strokeWidth = size.width * 0.075f
            val halfStrokeWidth = strokeWidth / 2

            drawLine(
                color = Color.Red,
                start = Offset(0f, 0f + halfStrokeWidth),
                end = Offset(size.width, size.height - halfStrokeWidth),
                strokeWidth = strokeWidth
            )

            drawLine(
                color = Color.Red,
                start = Offset(size.width, 0f + halfStrokeWidth),
                end = Offset(0f, size.height - halfStrokeWidth),
                strokeWidth = strokeWidth
            )
        }
    )
}

@Preview(showBackground = true)
@Composable
fun FieldPreview() {
    NoughtsAndCrossesTheme {
        Field(null)
    }
}
package com.joincoded.bankapi.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joincoded.bankapi.R
import com.joincoded.bankapi.ui.theme.DarkGreen
import com.joincoded.bankapi.viewmodel.GarageViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePageScreen(
    viewModel: GarageViewModel,
    onSignInClicked: () -> Unit,
    onSignUpClicked: () -> Unit,
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }
    Scaffold(
        modifier = Modifier.fillMaxWidth(),

        ) {


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )


        {


            Image(
                painter = painterResource(id = R.drawable.ligi),
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = MaterialTheme.shapes.small)

            )

            Spacer(modifier = Modifier.height(80.dp))


            Button(
                onClick = { onSignInClicked() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("Sign In")
            }

            Spacer(modifier = Modifier.height(6.dp))

            Button(
                onClick = { onSignUpClicked() },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text("Sign Up")
            }

        }

    }

}



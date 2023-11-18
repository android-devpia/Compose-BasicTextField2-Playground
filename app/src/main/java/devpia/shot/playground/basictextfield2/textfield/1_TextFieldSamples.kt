package devpia.shot.playground.basictextfield2.textfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.PreviewLightDark
import devpia.shot.playground.basictextfield2.components.SignUpScreenScaffold

@Composable
@PreviewLightDark
fun TextFieldBasic() {
    var textField by rememberSaveable { mutableStateOf("") }
    TextField(
        value = textField,
        onValueChange = { textField = it },
    )
}

@Composable
@PreviewLightDark
fun SignUpScreenWithTextField(
    modifier: Modifier = Modifier,
    onLoginSuccess: () -> Unit = {},
) {
    SignUpScreenScaffold {
        var username by remember { mutableStateOf("") }
        TextField(
            label = {
                Text(text = "username")
            },
            modifier = modifier.fillMaxWidth(),
            value = username,
            onValueChange = { username = it }
        )

        var password by remember { mutableStateOf("") }
        TextField(
            label = {
                Text(text = "password")
            },
            modifier = modifier.fillMaxWidth(),
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation()
        )
    }
}
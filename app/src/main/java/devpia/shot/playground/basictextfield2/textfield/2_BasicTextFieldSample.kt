package devpia.shot.playground.basictextfield2.textfield

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import devpia.shot.playground.basictextfield2.components.SignUpScreenScaffold
import devpia.shot.playground.basictextfield2.uicomponents.modifierBTFBorder

@Composable
@PreviewLightDark
fun SignUpScreenWithBasicTextField(
    modifier: Modifier = Modifier,
    onLoginSuccess: () -> Unit = {},
) {

    SignUpScreenScaffold {
        var username by remember { mutableStateOf("") }
        BasicTextField(
            modifier = modifier
                .fillMaxWidth(1f)
                .then(modifierBTFBorder),
            value = username,
            onValueChange = { username = it }
        )

        Spacer(modifier = Modifier.height(4.dp))

        var password by remember { mutableStateOf("") }
        BasicTextField(
            modifier = modifier
                .fillMaxWidth(1f)
                .then(modifierBTFBorder),
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation()
        )
    }
}

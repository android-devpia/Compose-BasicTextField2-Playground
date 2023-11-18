package devpia.shot.playground.basictextfield2.uicomponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import devpia.shot.playground.basictextfield2.ui.theme.fontFamilyDefault

@Composable
fun MainButton(onAction: () -> Unit, modifier: Modifier = Modifier, label: String) {
    Button(
        onClick = onAction, modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Text(
            text = label,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = fontFamilyDefault
        )
    }
}
package com.skifapp.myapplicationswa

import android.widget.Toast
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.core.text.isDigitsOnly

class TimeVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        return TransformedText(
            mask(text),
            timeOffsetTranslator
        )
    }

    private fun mask(text: AnnotatedString): AnnotatedString {
        if (text.text.isEmpty()) return text
        val s = if (text.text.length > 4) text.text.substring(0..3) else text.text
        var out = ""
        for (i in s.indices) {
            out += s[i]
            when (i) {
                1 -> out += ":"
            }
        }
        return AnnotatedString(out)
    }

    private val timeOffsetTranslator = object : OffsetMapping {
        override fun originalToTransformed(offset: Int): Int {
            return when {
                offset == 0 -> offset
                offset >= 2 -> offset + 1
                else -> offset
            }
        }

        override fun transformedToOriginal(offset: Int): Int {
            return when {
                offset == 0 -> offset
                offset <= 1 -> offset
                offset <= 4 -> offset - 1
                else -> offset
            }
        }
    }
}

class HoursVisualTransformation : VisualTransformation {
    override fun filter(text: AnnotatedString): TransformedText {
        var h = AnnotatedString("")
        if (text.text.length <= 2 && text.text.isDigitsOnly()) {
            if (text.text == "" || text.text.toInt() <= 23) {
                h = text
            }
        }
        return TransformedText(
            h,
            timeOffsetTranslator
        )
    }

    private val timeOffsetTranslator = object : OffsetMapping {
        override fun originalToTransformed(offset: Int): Int {
            return offset
        }

        override fun transformedToOriginal(offset: Int): Int {
            return when {
                offset == 0 -> offset
                offset <= 1 -> offset
                offset <= 4 -> offset - 1
                else -> offset
            }
        }
    }
}
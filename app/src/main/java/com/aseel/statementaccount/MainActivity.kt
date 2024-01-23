 package com.aseel.statementaccount

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aseel.statementaccount.ui.theme.StatementAccountTheme
import com.aseel.statementaccount.uiTheme.AccountCard

 class MainActivity : ComponentActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)

         setContent {
             StatementAccountTheme {

                 Surface(
                     modifier = Modifier.fillMaxSize(),
                     color = MaterialTheme.colorScheme.background
                 ) {
                     AccountList()


                 }
             }
         }
     }
 }

 @Composable
 fun AccountList(modifier: Modifier = Modifier) {
     var accountList = AccountRepo.dummyAccount

     LazyColumn {

         item { Text(text = " Details ") }
         itemsIndexed(accountList) { index, account ->
             AccountCard(
                 name = account.name,
                 transactionType = account.transactionType,
                 Amount = account.Amount,
                 detail = account.detail,
                 Date = account.Date,
                 modifier = Modifier
                     .background(if (index % 2 == 0) Color.Black else Color.Black) // Alternating background colors
                     .fillMaxWidth()
             )

         }
     }
 }

 @Composable
 fun Greeting(name: String, modifier: Modifier = Modifier) {
     Text(
         text = "Hello $name!",
         modifier = modifier
     )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StatementAccountTheme {
        Greeting("Android")
    }
}
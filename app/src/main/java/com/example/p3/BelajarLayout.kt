package com.example.p3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
){
    Column (modifier = Modifier.fillMaxSize())
    {
        HeaderSection()
        DetailMhs(                                                                              //karena yg dibawah ada parameter baru maka disini ditambahin argumen detailMhs
            param = "Nama",
            argum = "Ikhda Akmalia Putri"
        )
        DetailMhs(
            param = "NIM",
            argum = "20220140131"
        )
        DetailMhs(
            param = "Prodi",
            argum = "Teknologi Informasi"
        )
        DetailMhs(
            param = "Fakultas",
            argum = "Teknik"
        )
        DetailMhs(
            param = "Universitas",
            argum = "Universitas Muhammadiyah Yogyakarta"
        )
        DetailMhs(
            param = "Alamat",
            argum = "Daerah Istimewa Yogyakarta"
        )
        DetailMhs(
            param = "Email",
            argum = "ikhdaakmalia@gmail.com"
        )
    }
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray)
    ){
        Row (modifier = Modifier.fillMaxWidth().padding(16.dp))
        {
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.ti), contentDescription = null,
                    modifier = Modifier.clip(CircleShape))                                                                              //agar gambarnya jadi bulet
                Icon(
                    Icons.Filled.Check, contentDescription = null, modifier = Modifier.size(30.dp).background(Color.Blue)               //kasih tanda ceklis
                )
            }

            Column (modifier = Modifier.padding(14.dp))
            {
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }

        }
    }
}

@Composable
fun DetailMhs(
    param : String, argum: String                                                   //bikin parameter untuk mempermudah memanggil semuanya
){
    Column (modifier = Modifier.padding(16.dp))
    {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = param, modifier = Modifier.weight(0.8f))           //weight memberi ruang seberapa banyak kpd elemen
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = argum, modifier = Modifier.weight(2f))

        }
    }
}
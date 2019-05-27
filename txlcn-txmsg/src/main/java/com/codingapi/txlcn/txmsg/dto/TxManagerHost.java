/*
 * Copyright 2017-2019 CodingApi .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.codingapi.txlcn.txmsg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Company: CodingApi
 * Date: 2018/12/10
 *
 * @author ujued
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TxManagerHost {

    private String host;

    private int port;


    public static List<TxManagerHost> parserList(List<String> managerHost) {
        List<TxManagerHost> list = new ArrayList<>();
        for(String host:managerHost){
            String [] array = host.split(":");
            TxManagerHost manager = new TxManagerHost(array[0],Integer.parseInt(array[1]));
            list.add(manager);
        }
        return list;
    }
}

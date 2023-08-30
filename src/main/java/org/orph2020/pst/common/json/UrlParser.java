package org.orph2020.pst.common.json;

import jakarta.ws.rs.WebApplicationException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
 In case we need to get the URL content from a website
 */

public class UrlParser {

    public static String getContentFrom(String theUrl)
    {
        StringBuilder content = new StringBuilder();

        try
        {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                content.append(line).append("\n");
            }

            bufferedReader.close();
        }
        catch (Exception e)
        {
            throw new WebApplicationException(e.getMessage(), 500);
        }

        return content.toString();
    }
}

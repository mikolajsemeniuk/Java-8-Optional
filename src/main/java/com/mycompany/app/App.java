package com.mycompany.app;

import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        // Use StringBuilder instead of String because 
        // every time we concatenate string we create new object
        StringBuilder builder = new StringBuilder("hej");
        builder.append(" Hello World there!!!!");
        System.out.println( builder );

        Optional<String> optional = Optional.empty();

        // if the value would be empty orElse 
        // return default value pass in the parameter
        String world = optional
            // if value is not null transform it
            .map(String::toUpperCase)
            
            // .orElseGet(() -> {
            //     return "hehs";
            // })

            // .orElseThrow(Exception::new)

            // in Java 9 or above
            // .ifPresentOrElse(() -> {}, () -> {});

            .orElse("default");

        System.out.println(world);

        optional = Optional.of("test");

        optional.ifPresent(word -> {
            System.out.println(word);
        });

        Optional<String> useMeIfValueIsNotNeededAndCouldBeNull = Optional.ofNullable(null);

        String check = useMeIfValueIsNotNeededAndCouldBeNull
            .map(String::toUpperCase)
            .orElse("default");

        // only in java 11
        // System.out.println(optional.isEmpty());
        System.out.println(check);
        System.out.println(optional.isPresent());
    }
}

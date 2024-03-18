package dev.shiladitya.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> getAllMovies(){
        return new ResponseEntity<>("All Movies", HttpStatus.OK);
    }
    @GetMapping("/moviesJson")
    public Map<String, String> getAllMoviesJson(){
        Map<String, String> map = new HashMap<>();
        map.put("result","All Movies!");
        map.put("status", String.valueOf(HttpStatus.OK));
        return map;
    }
}

package com.example.gameserviceapi.controller;


import com.example.gameserviceapi.entities.Game;
import com.example.gameserviceapi.repositories.GameRepository;
import com.example.gameserviceapi.services.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }
    @GetMapping
    public ResponseEntity<Game> getAllGames(@RequestBody Game game) {
        Game gameFindAll = this.gameService.getAllGames(game);
        return ResponseEntity.ok(gameFindAll);
    }

    @PostMapping
    public ResponseEntity<Game> saveGame(@RequestBody Game game) {
        Game gameCreated = this.gameService.saveGame(game);
        return ResponseEntity.ok(gameCreated);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game game) {
        Game gameUpdate = this.gameService.updateGame(game);
        return ResponseEntity.ok(gameUpdate);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Game> deleteGame(@PathVariable Long id, @RequestBody Game game) {
        Game gameDelete = this.gameService.deleteGame(game);
        return ResponseEntity.ok(gameDelete);

    }
}
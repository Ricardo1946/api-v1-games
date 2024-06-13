package com.example.gameserviceapi.services;

import com.example.gameserviceapi.entities.Game;
import com.example.gameserviceapi.repositories.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Game getAllGames(Game gameRequest) {
        Game gameFindAllInDatabase = this.gameRepository.save(gameRequest);
        return gameFindAllInDatabase;
    }

    public Game saveGame(Game gameRequest) {
        Game gameCreatedInDatabase = this.gameRepository.save(gameRequest);
        return gameCreatedInDatabase;
    }

    public Game updateGame(Game gameRequest) {
        Game gameUpdatedInDatabase = this.gameRepository.save(gameRequest);

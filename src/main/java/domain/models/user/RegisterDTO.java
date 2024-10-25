package domain.models.user;

public record RegisterDTO(String login, String password, UserRole role) {
}

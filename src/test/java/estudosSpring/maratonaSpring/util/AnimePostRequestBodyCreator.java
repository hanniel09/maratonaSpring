package estudosSpring.maratonaSpring.util;

import estudosSpring.maratonaSpring.domain.Anime;
import estudosSpring.maratonaSpring.requests.AnimePostRequestBody;

public class AnimePostRequestBodyCreator {
    public static AnimePostRequestBody createAnimePostRequestBody() {
        return AnimePostRequestBody.builder()
                .name(AnimeCreator.createAnimeToBeSaved().getName())
                .build();

    }
}

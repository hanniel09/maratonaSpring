package estudosSpring.maratonaSpring.util;

import estudosSpring.maratonaSpring.requests.AnimePostRequestBody;
import estudosSpring.maratonaSpring.requests.AnimePutRequestBody;

public class AnimePutRequestBodyCreator {
    public static AnimePutRequestBody createAnimePutRequestBody() {
        return AnimePutRequestBody.builder()
                .id(AnimeCreator.createValidUpdatedAnime().getId())
                .name(AnimeCreator.createValidUpdatedAnime().getName())
                .build();

    }
}

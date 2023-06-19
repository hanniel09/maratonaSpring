package estudosSpring.maratonaSpring.mapper;

import estudosSpring.maratonaSpring.domain.Anime;
import estudosSpring.maratonaSpring.requests.AnimePostRequestBody;
import estudosSpring.maratonaSpring.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);
    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);
    public abstract Anime toAnime(AnimePutRequestBody animePutRequestBody);
}

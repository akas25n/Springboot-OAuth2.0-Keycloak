package com.photoappwebclient.model;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AlbumRest {

    private  String userId;
    private String albumId;
    private String albumTitle;
    private String albumDescription;
    private String albumUrl;
}

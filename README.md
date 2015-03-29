# A Tree's Life Profile Service
REST API for loading and saving profiles
> GET /profile/{slug}

  Loads a profile for the given slug. If no profile is found for the slug, a 404 error is thrown.
  
> POST /profile
> {
>   token: "abc123"
>   ...
> }

  Creates a new profile. The token resembles a unique, one-time use key to register a profile.
  
> PUT/POST /profile/{slug}
> {
>   ...
> }

  Updates a profile with the given slug. If no profile is found for the slug, a 404 error is thrown.

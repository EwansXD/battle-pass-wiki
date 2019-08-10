public interface BPI {

    /**
     * Method is used to see if
     * a week has been released
     *
     * @param week the week that we are going to check
     * @return {@code week} is smaller than {@link #getWeek()}
     */
    boolean isWeekReleased(int week);

    /**
     * Method is used to get the current
     * week by using values from the config.yml
     *
     * @return season start date minus current date
     */
    int getWeek();

    /**
     * Method is used to get the amount
     * of weeks there are in a season
     *
     * @return get value from config.yml via {@link pw.javadebug.battlepass.util.file.Cabinet}
     */
    int getMaxWeek();

    /**
     * Method is used to give a player
     * exp and at the same time reward
     * and tier up the player if their
     * exp were to surpass the required
     * amount of exp to tier up
     *
     * @param bPlayer the battle player object that we are going to modify
     * @param exp the amount of exp we will be giving the battle player object
     */
    void givePlayerExp(BPlayer bPlayer, int exp);

    /**
     * Method is used to give a player
     * rewards within a range of tiers
     *
     * @param bPlayer the battle player object that we are giving the rewards
     * @param startTier the first value in our {@link java.util.stream.IntStream}
     * @param endTier the last value in our {@link java.util.stream.IntStream}
     * @param onlyPremium if this is true it will only give the {@code bPlayer} premium rewards within the specified range
     */
    void giveRewardsRange(BPlayer bPlayer, int startTier, int endTier, boolean onlyPremium);

    /**
     * Method is used to give a player
     * the rewards of a tier
     *
     * @param bPlayer the battle player object that we are giving the reward
     * @param tier the tier we will be getting the rewards from
     * @param status 0 = free, 1 = premium, 2 = free & premium
     */
    void giveReward(BPlayer bPlayer, int tier, int status);

    /**
     * Method is used to get the
     * equivalent battle pass
     * profile of a normal
     * minecraft profile
     *
     * @param uuid the uuid that we will get or create a battle pass profile of
     * @return the battle pass profile that has been created or found
     */
    BPlayer getPlayer(UUID uuid);

    /**
     * Method is used to get the
     * equivalent battle pass
     * profile of a normal
     * minecraft profile
     *
     * @param player the player that we will get or create a battle pass profile of
     * @return the battle pass profile that has been created or found
     */
    BPlayer getPlayer(Player player);
}